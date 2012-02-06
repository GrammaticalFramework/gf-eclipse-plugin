--# -path=.:../abstract:../common:../../prelude
resource ResEng = {
	
	param
		Gender = Masc | Fem ;
		
	oper
		superate : Str -> {s : ResEng.Gender => Str} = \s ->
			{ s = \\_ => "super" ++ s } ;
 
		mega = overload {
			mega : Str -> {s : Gender => Str} = \s -> 
				{ s = \\_ => "mega" ++ s } ;
				
			mega : Str -> Str -> {s : Gender => Str} = \s,r ->
				{ s = \\_ => "mega" ++ s ++ "and" ++ "mega" ++ r }
		} ;		 
} ;
