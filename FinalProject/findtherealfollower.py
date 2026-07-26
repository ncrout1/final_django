import instaloader

L = instaloader.Instaloader()
# Log in is required to view relationship structures
L.login("lucknowwalanarsingh@gmail.com", "Ourjagannath9839@") 

profile = instaloader.Profile.from_username(L.context, "target_username")

# Load sets of usernames
followers = set(f.username for f in profile.get_followers())
following = set(f.username for f in profile.get_followees())

# Logic calculation
not_following_back = following - followers  # People you follow who don't follow you back
fans = followers - following 