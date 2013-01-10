html:
	echo "<html>\n<head>\n" > index.html
	echo "<title>GF Eclipse Plugin</title>\n" >> index.html
	echo "<link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.grammaticalframework.org/css/style.css\">\n" >> index.html
	echo '<meta name = "viewport" content = "width = device-width">' >>index.html
	echo "</head>\n<body>\n" >> index.html
	~/.cabal/bin/pandoc --from=markdown+pipe_tables --to=html ../README.md >> index.html
	echo "</body>\n</html>" >> index.html

