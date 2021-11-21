function createNode(key) {
    const children = []; //untuk nampung anak dari root (parent)
    return {
        key,
        children,

        addChild(childKey) {
            const childNode = createNode(childKey);
            children.push(childNode);
            return childNode;
        }
    }
}

function createTree(rootKey) {
    const root = createNode(rootKey);
    return {
        //root (parent)
        root,
        print() {
            let result = '';
            //visitFn -> kita sudah berada di node mana?
            //depth -> kedalamannya ada di level berapa ?
            function traverse(node, visitFn, depth) {
                visitFn(node, depth);

                if(node.children.length) {
                    node.children.forEach(function(child) {
                        traverse(child, visitFn, depth + 1);
                    });
                }
            }

            function addKeyToResult(node, depth) {
                result += result.length == 0 ? node.key : `\n${' '.repeat(depth * 2)}${node.key}`; //biar terlihat seperti tree
                //semakin ke bawah semakin banyak spasinya
            }

            traverse(root, addKeyToResult, 1);
            return result;
        }
    }
}

const dom = createTree('html');
const head = dom.root.addChild('head');
const title = head.addChild('title');

const body = dom.root.addChild('body');
const header = body.addChild('header');
const main = body.addChild('main');
const footer = body.addChild('footer');

const h1 = header.addChild('h1');
const p = main.addChild('p');
const copy = footer.addChild('Copyright 2021');

console.log(dom.print());