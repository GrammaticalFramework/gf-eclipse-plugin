#!/bin/sh
# Refer: http://austinmatzko.com/2008/04/26/sed-multi-line-search-and-replace/
if [ $# -lt 2 ] ; then
	echo "Usage: $0 SOURCE TARGET"
	exit 1
fi
sed -n '1h;1!H;${;g;s/{.*}/{}/g;p;}' $1 > $2
