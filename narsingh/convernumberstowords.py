UNITS = (
    "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
    "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
    "seventeen", "eighteen", "nineteen"
)

TENS = (
    "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
)

THOUSANDS = ("", "thousand", "million", "billion", "trillion")


def convert_to_words(num: int) -> str:
    if num == 0:
        return "zero"
    if num < 0:
        return f"negative {convert_to_words(-num)}"

    chunks = []
    chunk_index = 0

    while num > 0:
        remainder = num % 1000
        if remainder != 0:
            words = []
            
            # Process hundreds
            if remainder >= 100:
                words.append(f"{UNITS[remainder // 100]} hundred")
                remainder %= 100

            # Process tens and units
            if remainder >= 20:
                words.append(TENS[remainder // 10])
                if remainder % 10 > 0:
                    words.append(UNITS[remainder % 10])
            elif remainder > 0:
                words.append(UNITS[remainder])

            # Append scale (thousand, million, etc.)
            if THOUSANDS[chunk_index]:
                words.append(THOUSANDS[chunk_index])

            # Prepend the chunk's result
            chunks.append(" ".join(words))

        num //= 1000
        chunk_index += 1

    # Join in correct order (highest scale first)
    return " ".join(reversed(chunks))


# Example usage
if __name__ == "__main__":
    print(convert_to_words(1234))        # one thousand two hundred thirty four
    print(convert_to_words(12345))       # twelve thousand three hundred forty five
    print(convert_to_words(1000005))     # one million five