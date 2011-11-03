-- Functor Instantiation
concrete FoodsEng of Foods = FoodsI - [Pizza] with
	(Syntax = SyntaxEng),
	(LexFoods = LexFoodsEng) **
	open SyntaxEng, ParadigmsEng in {

	lin
		Pizza = mkCN (mkA "Italian") (mkN "pies") ;
}
