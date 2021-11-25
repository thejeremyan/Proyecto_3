package dijkstra;

import set_get.set_get;

public class sebalol {

    NodeWeighted Alajuela ;
    NodeWeighted Pozos;
    NodeWeighted SantaAna ;
    NodeWeighted Escazu ;
    NodeWeighted Alajuelita ;
    NodeWeighted Desamparados ;
    NodeWeighted Curridabat ;
    NodeWeighted Zapote ;
    NodeWeighted SanPedro ;
    NodeWeighted Coronado ;
    NodeWeighted Moravia ;
    NodeWeighted Heredia ;
    NodeWeighted Belen ;
    NodeWeighted Pavas ;
    NodeWeighted Sabana ;
    GraphWeighted graphWeighted;
    public void sebalol() {

    }

    public void manuela(){
        graphWeighted = new GraphWeighted(true);
        Alajuela = new NodeWeighted(0, "Alajuela");
         Pozos = new NodeWeighted(1, "Pozos");
         SantaAna = new NodeWeighted(2, "SantaAna");
         Escazu = new NodeWeighted(3, "Escazu");
         Alajuelita = new NodeWeighted(4, "Alajuelita");
         Desamparados = new NodeWeighted(5, "Desamparados");
         Curridabat = new NodeWeighted(6, "Curridabat");
         Zapote = new NodeWeighted(7, "Zapote");
         SanPedro = new NodeWeighted(8, "SanPedro");
         Coronado = new NodeWeighted(9, "Coronado");
         Moravia = new NodeWeighted(10, "Moravia");
         Heredia = new NodeWeighted(11, "Heredia");
         Belen = new NodeWeighted(12, "Belen");
         Pavas = new NodeWeighted(13, "Pavas");
         Sabana = new NodeWeighted(14, "Sabana");

        // Our addEdge method automatically adds Nodes as well.
        // The addNode method is only there for unconnected Nodes,
        // if we wish to add any
        // Weighted per minutes
        graphWeighted.addEdge(Alajuela, Pozos, 8.55);
        graphWeighted.addEdge(Pozos, Alajuela, 8.55);

        graphWeighted.addEdge(Alajuela, Belen, 6.37);
        graphWeighted.addEdge(Belen, Alajuela, 6.37);

        graphWeighted.addEdge(Alajuela, Heredia, 9.22);
        graphWeighted.addEdge(Heredia,Alajuela, 9.22);

        graphWeighted.addEdge(Pozos, SantaAna, 3);
        graphWeighted.addEdge(SantaAna,Pozos,  3);

        graphWeighted.addEdge(Pozos, Belen, 5);
        graphWeighted.addEdge(Belen,Pozos,  5);

        graphWeighted.addEdge(SantaAna, Escazu, 4.5);
        graphWeighted.addEdge(Escazu,SantaAna,  4.5);

        graphWeighted.addEdge(Escazu, Alajuelita, 5.1);
        graphWeighted.addEdge(Alajuelita, Escazu, 5.1);

        graphWeighted.addEdge(Escazu, Sabana, 5.55);
        graphWeighted.addEdge( Sabana,Escazu, 5.55);

        graphWeighted.addEdge(Alajuelita, Desamparados, 4.42);
        graphWeighted.addEdge(Desamparados, Alajuelita, 4.42);

        graphWeighted.addEdge(Alajuelita, Sabana, 6);
        graphWeighted.addEdge(Sabana, Alajuelita, 6);

        graphWeighted.addEdge(Desamparados, Curridabat, 3);
        graphWeighted.addEdge(Curridabat, Desamparados, 3);

        graphWeighted.addEdge(Curridabat, Zapote, 2.32);
        graphWeighted.addEdge(Zapote, Curridabat, 2.32);

        graphWeighted.addEdge(Zapote, SanPedro, 2);
        graphWeighted.addEdge(SanPedro, Zapote, 2);

        graphWeighted.addEdge(Zapote, Sabana, 9);
        graphWeighted.addEdge(Sabana, Zapote, 9);

        graphWeighted.addEdge(SanPedro, Coronado, 9.40);
        graphWeighted.addEdge(Coronado, SanPedro, 9.40);

        graphWeighted.addEdge(Coronado, Moravia, 7.12);
        graphWeighted.addEdge(Moravia, Coronado, 7.12);

        graphWeighted.addEdge(Moravia, Heredia, 12.6);
        graphWeighted.addEdge(Heredia,Moravia,  12.6);

        graphWeighted.addEdge(Moravia, Sabana, 13.5);
        graphWeighted.addEdge(Sabana,Moravia,  13.5);

        graphWeighted.addEdge(Heredia, Sabana, 7.2);
        graphWeighted.addEdge(Sabana, Heredia, 7.2);

        graphWeighted.addEdge(Heredia, Belen, 7);
        graphWeighted.addEdge(Belen,Heredia,  7);

        graphWeighted.addEdge(Sabana, Pavas, 3);
        graphWeighted.addEdge( Pavas,Sabana, 3);
        //graphWeighted.DijkstraShortestPath(Alajuela,Escazu);

        NodeWeighted salida = StringToNode(set_get.getInstance().getPuntos_salida());
        NodeWeighted destino = StringToNode(set_get.getInstance().getPuntos_destino());

        set_get.getInstance().setUltimo(graphWeighted.DijkstraShortestPath(salida,destino));

    }
    public NodeWeighted StringToNode(String nombre){
        if (nombre == "Alajuela"){
            return Alajuela;

        }
        else if (nombre == "Alajuelita"){
            return Alajuelita;
        }
        else if (nombre == "Belen"){
            return Belen;
        }
        else if (nombre == "Curridabat"){
            return Curridabat;
        }
        else if (nombre == "Desamparados"){
            return Desamparados;
        }
        else if (nombre== "Escazu"){
            return Escazu;
        }
        else if (nombre == "Moravia"){
            return Moravia;
        }
        else if (nombre == "Pavas"){
            return Pavas;
        }
        else if (nombre == "Pozos"){
            return Pozos;
        }
        else if (nombre == "Sabana"){
            return Sabana;
        }
        else if (nombre == "San Pedro"){
            return SanPedro;
        }
        else if (nombre == "Santa Ana"){
            return SantaAna;
        }
        else if (nombre == "Zapote"){
            return Zapote;
        }
        else if (nombre == "Coronado"){
            return Coronado;
        }
        else if (nombre == "Heredia"){
            return Heredia;
        }
        else{return null;}
    }
}
