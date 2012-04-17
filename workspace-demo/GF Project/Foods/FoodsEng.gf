-- Functor Instantiation
--# -path=present
concrete FoodsEng of Foods = FoodsI - [Pizza] with
  (Syntax = SyntaxEng),
  (LexFoods = LexFoodsEng) **
  open SyntaxEng, ParadigmsEng in {

  lin
    Pizza = mkCN (ParadigmsEng.mkA "Italian") (mkN "pies") ;
} ; 
