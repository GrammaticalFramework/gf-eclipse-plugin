--# -path=.:/home/john/.cabal/share/gf-3.3/lib/alltenses
abstract Cl = Verbs ** {

cat
  NP;

  Act;
  Clause;
  ClauseO;
  ClauseP;
  ClauseF;
  [Clause]{2};
  [ClauseO]{2};
  [ClauseP]{2};
  [Act]{2};

fun 
  clauseO : NP -> ClauseO -> Clause ;
  clauseP : NP -> ClauseP -> Clause ;
  clauseF : NP -> ClauseF -> Clause ;
  andC  : [Clause] -> Clause ;
  cond : NP -> Act -> Clause -> Clause ;
  satisfaction : Clause ;
  violation    : Clause ;

  O : Act -> Clause -> ClauseO ;
  choiceO : [ClauseO] -> ClauseO ;
  
  P : Act -> ClauseP ;
  choiceP : [ClauseP] -> ClauseP ;

  F : Act -> Clause -> ClauseF ;

  atom   : V -> NP -> Act ;
  andAct : [Act] -> Act ;

  npSg : String -> NP;
  npPl : String -> NP;  
}
