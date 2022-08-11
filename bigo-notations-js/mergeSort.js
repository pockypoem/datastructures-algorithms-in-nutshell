// Big O (n log n) Function

// Gonna be Recursive Function
// Slice method slices up to end but not including n
function mergeSort(arr) { // O(n log n)
    if (arr.length < 2) {
        return arr;
    }

    const middleIndex = Math.floor(arr.length / 2);
    const leftArr = arr.slice(0, middleIndex);
    const rightArr = arr.slice(middleIndex, arr.length);


    return merge(mergeSort(leftArr), mergeSort(rightArr)); // O(n)
}

// Helper function
function merge(leftArr, rightArr) { // O (log n)
    let resultArr = [];
    let leftIndex = 0;
    let rightIndex = 0;

    while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
        if (leftArr[leftIndex] < rightArr[rightIndex]) {
            resultArr.push(leftArr[leftIndex]);
            leftIndex += 1;
        } else {
            resultArr.push(rightArr[rightIndex]);
            rightIndex += 1;
        }
    }
    return resultArr.concat(leftArr.slice(leftIndex)).concat(rightArr.slice(rightIndex));
}

let arr = [12, 3, 16, 6, 5, 1];
let arr2 = [9, 30, 13, 14, 40, 42, 10];
console.log(mergeSort(arr2));