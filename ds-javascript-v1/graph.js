function createNode(key) {
    const neighbors = [];
    return {
        key,
        neighbors,
        //neighbors (node berikutnya yang berelasi dengan node saat ini)
        //contoh: Ani berteman dengan Banu, Banu berteman dengan Cindy,
        //maka neighbors dari Ani adalah Banu dan Cindy

        addNeighbor: function(node) {
            neighbors.push(node);
        }
    }
}

function createGraph(directed = false) {
    const nodes = [];
    const edges = [];
    return {
        directed,
        nodes,
        edges,

        //Methods:
        addNode: function(key) {
            const newNode = createNode(key);
            nodes.push(newNode);
        },
        getNode: function(key) {
            return nodes.find(function(node) {
                return node.key == key;
            })
        },
        addEdge: function(node1key, node2key) {
            const node1 = this.getNode(node1key);
            const node2 = this.getNode(node2key);

            node1.addNeighbor(node2);

            if(!directed) {
                node2.addNeighbor(node1);
            }
        },
        print: function() {
            //bentuk harus string
            return nodes.map(function ({key, neighbors}) {
                let result = key;

                if (neighbors.length) {
                    result += ` => ${neighbors.map(function (neighbor) {
                        return neighbor.key;
                    }).join(' ')}`;
                }

                return result;
            }).join('\n');
        }
    }
}

const graph = createGraph(true); //directed

graph.addNode('Ani');
graph.addNode('Banu');
graph.addNode('Cindy');
graph.addNode('Dina');
graph.addNode('Elisa');
graph.addNode('Fadli');

graph.addEdge('Ani', 'Banu');
graph.addEdge('Banu', 'Cindy');
graph.addEdge('Banu', 'Dina');
graph.addEdge('Ani', 'Dina');
graph.addEdge('Dina', 'Fadli');
graph.addEdge('Elisa', 'Fadli');
graph.addEdge('Fadli', 'Ani');

console.log(graph.print());

