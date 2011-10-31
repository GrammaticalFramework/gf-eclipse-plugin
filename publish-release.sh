#!/bin/sh

REPO_DIR="/home/john/repositories/GF/eclipse"

# ===== Copy plugin releases =====
echo "Copying files..."
cp -rf ./releases/* $REPO_DIR/release/

# ===== Commit to darcs repo =====
echo "Commiting to darcs..."
ORIGDIR=`pwd`
cd $REPO_DIR
darcs add -r release
darcs record -am "Added GFEP release for `date -R`" release
echo "Password: karat33/comb"
darcs push --match "touch ./release"
cd $ORIGDIR

echo "Done, and back where we started."
