package dijkstra;

public class GraphAndDijkstra {
    public static void main(String[] args) {
        GraphWeighted graphWeighted = new GraphWeighted(true);
        NodeWeighted Alajuela = new NodeWeighted(0, "0");
        NodeWeighted Pozos = new NodeWeighted(1, "1");
        NodeWeighted SantaAna = new NodeWeighted(2, "2");
        NodeWeighted Escazu = new NodeWeighted(3, "3");
        NodeWeighted Alajuelita = new NodeWeighted(4, "4");
        NodeWeighted Desamparados = new NodeWeighted(5, "5");
        NodeWeighted Curridabat = new NodeWeighted(6, "6");
        NodeWeighted Zapote = new NodeWeighted(7, "7");
        NodeWeighted SanPedro = new NodeWeighted(8, "8");
        NodeWeighted Coronado = new NodeWeighted(9, "9");
        NodeWeighted Moravia = new NodeWeighted(10, "10");
        NodeWeighted Heredia = new NodeWeighted(11, "11");
        NodeWeighted Belen = new NodeWeighted(12, "12");
        NodeWeighted Pavas = new NodeWeighted(13, "13");
        NodeWeighted Sabana = new NodeWeighted(14, "14");


        // Our addEdge method automatically adds Nodes as well.
        // The addNode method is only there for unconnected Nodes,
        // if we wish to add any
        graphWeighted.addEdge(Alajuela, Pozos, 8);
        graphWeighted.addEdge(Pozos, Alajuela, 8);

        graphWeighted.addEdge(Alajuela, Belen, 11);
        graphWeighted.addEdge(Belen, Alajuela, 11);

        graphWeighted.addEdge(Alajuela, Heredia, 11);
        graphWeighted.addEdge(Heredia,Alajuela, 11);

        graphWeighted.addEdge(Pozos, SantaAna, 3);
        graphWeighted.addEdge(SantaAna,Pozos,  8);

        graphWeighted.addEdge(SantaAna, Escazu, 7);
        graphWeighted.addEdge(Escazu,SantaAna,  9);

        graphWeighted.addEdge(Escazu, Alajuelita, 5);
        graphWeighted.addEdge(Alajuelita, Escazu, 5);

        graphWeighted.addEdge(Alajuelita, Desamparados, 2);
        graphWeighted.addEdge(Desamparados, Alajuelita, 2);

        graphWeighted.addEdge(Desamparados, Curridabat, 6);
        graphWeighted.addEdge(Curridabat, Desamparados, 6);

        graphWeighted.addEdge(Curridabat, Zapote, 1);
        graphWeighted.addEdge(Zapote, Curridabat, 1);

        graphWeighted.addEdge(Zapote, SanPedro, 8);
        graphWeighted.addEdge(SanPedro, Zapote, 8);

        graphWeighted.addEdge(SanPedro, Coronado, 11);
        graphWeighted.addEdge(Coronado, SanPedro, 11);

        graphWeighted.addEdge(Coronado, Moravia, 11);
        graphWeighted.addEdge(Moravia, Coronado, 11);

        graphWeighted.addEdge(Moravia, Heredia, 11);
        graphWeighted.addEdge(Heredia,Moravia,  11);

        graphWeighted.addEdge(Moravia, Sabana, 11);
        graphWeighted.addEdge(Sabana,Moravia,  11);

        graphWeighted.addEdge(Heredia, Sabana, 11);
        graphWeighted.addEdge(Sabana, Heredia, 11);

        graphWeighted.addEdge(Heredia, Belen, 11);
        graphWeighted.addEdge(Belen,Heredia,  11);

        graphWeighted.addEdge(Sabana, Pavas, 11);
        graphWeighted.addEdge( Pavas,Sabana, 11);

        graphWeighted.DijkstraShortestPath(Alajuela, Sabana);
    }
}
