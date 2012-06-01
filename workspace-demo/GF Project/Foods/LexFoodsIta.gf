-- Lexicon Instance
instance LexFoodsIta of LexFoods =
	open SyntaxIta, ParadigmsIta in {

	flags
		coding = utf8 ;

	oper
		wine_N = mkN "vino" ;
		pizza_N = mkN "pizza" ;
		cheese_N = mkN "formaggio" ;
		fish_N = mkN "pesce" ;
		fresh_A = mkA "frescho" ;
		warm_A = mkA "caldo" ; 
		italian_A = mkA "Italiano" ;
		expensive_A = mkA "caro" ;
		delicious_A = mkA "buono" ;
		boring_A = mkA "noioso" ;
} ; 
