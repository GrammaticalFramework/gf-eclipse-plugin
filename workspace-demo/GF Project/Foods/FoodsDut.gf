-- Auto-generated template
--# -path=.:present
concrete FoodsDut of Foods = CatDut **
  open SyntaxDut, ParadigmsDut in {

  lincat
    Phrase = Utt ;
    Item = NP ; 
    Kind = CN ;
    Quality = AP ;

  lin
    Is item quality = mkUtt (mkCl item quality) ;
    This kind = mkNP this_Quant kind ;
    That kind = mkNP that_Quant kind ;
    These kind = mkNP this_Quant plNum kind ;
    Those kind = mkNP that_Quant plNum kind ;
    QKind quality kind = mkCN quality kind ;
    Wine = mkCN (mkN "wijn") ;
    Pizza = mkCN (mkN "pizza") ;
    Cheese = mkCN (mkN "kaas") ;
    Fish = mkCN (mkN "vis") ;
    Very quality = mkAP very_AdA quality ;
    Fresh = mkAP (mkA "vers") ;
    Warm = mkAP (mkA "warm") ;
    Italian = mkAP (mkA "Italiaans") ;
    Expensive = mkAP (mkA "duur") ;
    Delicious = mkAP (mkA "lekker") ;
    Boring = mkAP (mkA "saai") ; 
} ;
