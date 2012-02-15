--# -path=.:../abstract:../common:../../prelude
resource ResEng = {
	
	param
		Gender = Masc | Fem ; -- Gender of the noun
		
	oper
		superate : Str -> {s : ResEng.Gender => Str} = \s ->
			{ s = \\_ => "super" ++ s } ;
 
		mega = overload {
			mega : Str -> {s : Gender => Str} = \s -> -- this version takes only one string
				{ s = \\_ => "mega" ++ s } ;
				
			mega : Str -> Str -> {s : Gender => Str} = \s,r -> -- this takes two
				{ s = \\_ => "mega" ++ s ++ "and" ++ "mega" ++ r }
		} ;		 
} ;
