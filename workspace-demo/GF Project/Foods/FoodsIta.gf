-- Functor Instantiation
--# -path=present
concrete FoodsIta of Foods = FoodsI with
  (Syntax = SyntaxIta),
  (LexFoods = LexFoodsIta) ;
 