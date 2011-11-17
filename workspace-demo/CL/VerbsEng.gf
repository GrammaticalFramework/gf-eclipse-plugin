--# -path=.:/home/john/.cabal/share/gf-3.3/lib/alltenses
concrete VerbsEng of Verbs = open SyntaxEng, ParadigmsEng in {

lincat
  V  = SyntaxEng.V;

lin
  buy_V = mkV "buy" ;
  suspend_V = mkV "suspend" ;
  supply_V = mkV "supply" ;
  open_V = mkV "open" ;
  request_V = mkV "request" ;
  reply_V = mkV "reply" ;
  initiate_V = mkV "initiate" ;
  check_V = mkV "check" ;

}
