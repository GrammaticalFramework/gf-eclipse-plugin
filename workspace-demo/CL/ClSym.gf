--# -path=.:/home/john/.cabal/share/gf-3.3/lib/alltenses
concrete ClSym of Cl = VerbsEng ** open SyntaxEng, ParadigmsEng, ResEng in {

lincat
  NP = {s:Str};
  
  Act     = {s:Str};
  Clause  = {s:Str};
  ClauseO = {s:Str};
  ClauseP = {s:Str};
  ClauseF = {s:Str};
  
  [Act]   = {s:Str};

lin
  npSg s = s ;
  npPl s = s ;

  clauseO _ co = co ;
  clauseP _ cp = cp ;
  clauseF _ cf = cf ;
  
  violation    = {s = "_|_"};
  satisfaction = {s = "^|^"} ;

  O act cl = {s = "O" ++ "(" ++ act.s ++ ")" ++ "_" ++ "(" ++ cl.s ++ ")"} ;
  
  P act = {s = "P" ++ "(" ++ act.s ++ ")"} ;
  
  F act cl = {s = "F" ++ "(" ++ act.s ++ ")" ++ "_" ++ "(" ++ cl.s ++ ")"} ;

  atom v np = {s = v.s ! VInf ++ np.s} ;
  andAct as = as ;

  BaseAct a1 a2 = {s = a1.s ++ "&" ++ a2.s} ;
  ConsAct a  as = {s = a.s  ++ "&" ++ as.s} ;

}
