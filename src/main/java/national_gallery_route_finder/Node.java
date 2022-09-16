package national_gallery_route_finder;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    public T data;
    public int nodeValue= Integer.MAX_VALUE;
    public List<Link> adjList = new ArrayList<>();

    public Node(T data) {
        this.data=data;
    }

    public void connectToNodeUndirected(Node<T> destNode, int cost) {
        adjList.add(new Link(destNode,cost));
        destNode.adjList.add(new Link(this,cost));
    }
}
