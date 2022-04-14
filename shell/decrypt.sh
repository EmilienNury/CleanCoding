#!/usr/bin/env bash
##
# @Description
# This script decrypt with 'gpg' a file.
#
# @Args
#  - $1 : Password
#  - $2 : Source file
#  - $3 : Output file
#
# @Error code:
#  - 11 : Password to decrypt
#  - 12 : No input file found
#  - 13 : No output file defined
##


# Test if the first arg is not empty
if [ -z "${1}" ]; then
  exit 11
fi

# Test if the second arg is not empty
if [ -z "${2}" ]; then
  exit 12
fi

# Test if the third arg is not empty
if [ -z "${3}" ]; then
  exit 13
fi

gpg -d --batch --passphrase "${1}" "${2}"> "${3}"