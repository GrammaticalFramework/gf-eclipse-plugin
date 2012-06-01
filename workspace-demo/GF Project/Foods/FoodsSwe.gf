-- Functor Instantiation
--# -path=present
concrete FoodsSwe of Foods = FoodsI with
	(Syntax = SyntaxSwe),
	(LexFoods = LexFoodsSwe) ** {

	flags
		language = sv_SE ;
} ;
