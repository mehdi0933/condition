package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {



        public static void main(String[] args) {

            int billetCinquante =  0;
            int billetVingt     =  0;
            int billetDix       =  0;
            int billetDeux      =  0;
            int billetUn        =  0;

            int nombreBilletCinquante =  0;
            int nombreBilletVingt     =  5;
            int nombreBilletDix       =  3;
            int nombreBilletDeux      =  0;
            int nombreBilletUn        =  0;

            int totalBill     =  100;   // factureTotale
            int amountPaid    =   50;   // montantPayé
            int laMonnaie     =    0;

            if(totalBill < amountPaid){
                System.err.println("le montent est pas bon");
            }

            if( totalBill == amountPaid){

                System.out.println("vous avez paye la bonne somme");

            } else if (totalBill > amountPaid) {


                laMonnaie = totalBill - amountPaid;
                System.out.println("la monnaie rendu est : " + laMonnaie);


                if( laMonnaie >= 50  && nombreBilletCinquante !=0 &&  laMonnaie %   nombreBilletCinquante >= 50){


                    billetCinquante = laMonnaie / 50;
                    laMonnaie = laMonnaie % 50;
                    System.out.println(billetCinquante + " nombre de billet de 50");

                }


                if( laMonnaie <= 50  && laMonnaie >= 20   && nombreBilletVingt !=0 &&  laMonnaie %   nombreBilletVingt >= 20){

                    billetVingt = laMonnaie / 20;
                    laMonnaie = laMonnaie % 20;
                    System.out.println(billetVingt + " nombre de billet de 20");

                }

                if(laMonnaie <= 20  && laMonnaie >= 10 && nombreBilletDix !=0 &&  laMonnaie %   nombreBilletDix >= 10){

                    billetDix = laMonnaie / 10;
                    laMonnaie = laMonnaie % 10;
                    System.out.println(billetDix + " nombre de billet de 10");

                }

                if(laMonnaie <= 10  && laMonnaie >= 2 && nombreBilletDeux !=0 &&  laMonnaie %   nombreBilletDeux >= 2){

                    billetDeux = laMonnaie / 2;
                    laMonnaie = laMonnaie %  2;
                    System.out.println(billetDeux + " nombre de billet de 2");

                }

                if( laMonnaie == 1  && nombreBilletUn !=0 &&  laMonnaie %   nombreBilletUn >= 1){

                    billetUn = laMonnaie / 1;
                    laMonnaie = laMonnaie %  1;
                    System.out.println(billetUn + " nombre de billet de 1");

                }

            }

        }
    }


