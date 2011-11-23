concrete HelloEng of HelloAbs = ResEng ** { 
--concrete HelloEng of HelloAbs = open (R=ResEng) in {
	
	flags
		coding = utf8 ;
 
	lincat
		Greeting, Farewell = {s : Str} ;
		Recipient = {s : ResEng.Gender => Str} ; 

	lin
 		Hello recip = {s = "hello" ++ recip.s ! Masc } ;
		Goodbye recip = {s = "goodbye" ++ recip.s ! Masc } ;

		World = {s = \\_ => "world"} ;
		Parent = { s = table {
			Masc => "dad" ; Fem => "mum"
		} } ;
		Friends = ResEng.mega "friends" "loved ones" ;
} ;