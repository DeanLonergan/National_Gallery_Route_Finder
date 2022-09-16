package national_gallery_route_finder;

public class Link {
        public Node<?> destNode;
        public int cost;

        public Link(Node<?> destNode, int cost) {
            this.destNode=destNode;
            this.cost=cost;
        }
    }


