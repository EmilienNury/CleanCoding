# CleanCoding

In this project, I made a workflow that recover keystore and api keys from GitHub Action Secrets and buid the app when pushing from a /feature branch.
I also used Koin to manage the networking and the Marvel API to fetch all Marvel characters.

## Issues

I tried to recover the project on my computer, but it couldn't run because the keystore.p12, keystore.properties and api_keys.properties where missing because they were ignored by .gitignore. Then I tried to recover these files from the secrets by using the workflow, but for reason that I don't know it didn't worked on my Windows computer where it was working on the Mac. I installed gpg, tried to echo the secrets to the logs and manually decrypt them, but the only thing I got is some weird characters that were not keys I expected. This blocked me a lot and I was unable to continue this project with these isssues.
