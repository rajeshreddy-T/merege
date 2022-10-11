// merge sort
// 1. divide the array into two halves
// 2. sort the two halves
// 3. merge the two halves
// 4. return the merged array
// 5. repeat until the array is sorted

function mergeSort(arr) {
    if (arr.length < 2) {
        return arr;
    }
    var middle = Math.floor(arr.length / 2);
    var left = arr.slice(0, middle);
    var right = arr.slice(middle, arr.length);
    return merge(mergeSort(left), mergeSort(right));
}

function merge(left, right) {
    var result = [];
    while (left.length && right.length) {
        if (left[0] <= right[0]) {
            result.push(left.shift());
        } else {
            result.push(right.shift());
        }
    }
    while (left.length) {
        result.push(left.shift());
    }
    while (right.length) {
        result.push(right.shift());
    }
    return result;
}

var arr = [3, 2, 1, 4, 5, 6, 7, 8, 9, 10];
console.log(mergeSort(arr));

