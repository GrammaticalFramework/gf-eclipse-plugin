--# -path=.:../abstract:../common:../../prelude
resource ResEng = {
	
	param
		Gender = Masc | Fem ; -- Gender of the noun
		Case =
		  Nom | -- Nominative case
		  Acc ; -- Accusative case
		  
	  -- Inline comment on top of the declaration
		Case2 =
		  Nom2 | Acc2 ;
		
	oper
		superate : Str -> {s : ResEng.Gender => Str} = \s ->
			{ s = \\_ => "super" ++ s } ;
 
		mega = overload {
			mega : Str -> {s : Gender => Str} = \s -> -- this version takes only one string
				{ s = \\_ => "mega" ++ s } ;
			
			-- version takes two
			mega : Str -> Str -> {s : Gender => Str} = \s,r ->
				{ s = \\_ => "mega" ++ s ++ "and" ++ "mega" ++ r }
		} ;		 
} ;
