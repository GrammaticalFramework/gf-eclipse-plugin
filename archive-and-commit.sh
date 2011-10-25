#!/bin/sh
# Ref: http://potatokorner.blogspot.com/2009/01/script-to-make-tar-gzip-archives-of.html

REPO_DIR="/home/john/repositories/molto-project.eu/eclipse"

# ===== 1: Archive workspaces =====
FOLDERS="./workspace ./workspace-demo"
BACKUPFOLDER=$REPO_DIR"/snapshots"

COMPRESSCMD="tar czf "
echo "Creating archives..."
for itm in $FOLDERS; do
	FARCHIVE=$BACKUPFOLDER/`basename $itm`_`date +%F`.tgz
	$COMPRESSCMD $FARCHIVE $itm
	echo "  $FARCHIVE"
done

# ===== 2: Copy plugin releases =====
echo "Copying releases"
cp -rf ./releases/* $REPO_DIR/releases/

# ===== 3: Commit to SVN repo =====
echo "Commiting to svn..."
ORIGDIR=`pwd`
cd $REPO_DIR
svn add * --force
svn commit -m "Added today's workspace snapshot" .
cd $ORIGDIR

echo "Done, and back where we started."
