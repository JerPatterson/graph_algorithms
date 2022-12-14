package graph;

import java.util.ArrayList;

public class UndirectedWeightedGraph extends WeightedGraph {
    UndirectedWeightedGraph() {
        super();
    }


    @Override
    public void addNewVertex(String identifier, String[] adjacents, Integer[] weights) {
        super.addNewVertex(identifier, adjacents, weights);
        int i = 0;
        for (String adjacent : adjacents) {
            if (identifier.compareTo(adjacent) != 0)
                super.addNewVertex(adjacent, new String[] { identifier }, new Integer[] { weights[i++] });
        }
    }


    @Override
    public ArrayList<String> topologicalSort() {
        return null;
    }

    @Override
    public UndirectedWeightedGraph getTransposed() {
        return this;
    }
}
