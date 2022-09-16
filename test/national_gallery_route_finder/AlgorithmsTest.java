package national_gallery_route_finder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlgorithmsTest {
    Node<Room> room1 = new Node<>(new Room("Room 1", 123,321));
    Node<Room> room2 = new Node<>(new Room("Room 2", 123,321));
    Node<Room> room3 = new Node<>(new Room("Room 3", 123,321));
    Node<Room> room4 = new Node<>(new Room("Room 4", 123,321));
    Node<Room> room5 = new Node<>(new Room("Room 5", 123,321));
    Node<Room> room6 = new Node<>(new Room("Room 6", 123,321));

    @BeforeEach
    void setUp() {
        room1.connectToNodeUndirected(room2,1);
        room4.connectToNodeUndirected(room2,1);
        room6.connectToNodeUndirected(room4,1);
        room5.connectToNodeUndirected(room4,1);
        room5.connectToNodeUndirected(room3,1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void depthFirstSearchAllPaths() {
        System.out.println(Algorithms.depthFirstSearchAllPaths(room2,null, room2));
    }

    @Test
    void depthFirstSearchCheapestPath() {

    }

    @Test
    void dijkstraSearchCheapestPath() {
        System.out.println(Algorithms.dijkstraSearchCheapestPath(room1, room2));
    }
}