package net.openhft.chronicle.map;

import org.junit.Test;

public class NodeDiscoveryTest {

    @Test
    public void testDiscoverMap() throws Exception {
        final NodeDiscovery nodeDiscovery = new NodeDiscovery();
        final ChronicleMap<Integer, CharSequence> map = nodeDiscovery.discoverMap(1235, 1236);

       // Thread.sleep(10000);
    }
}