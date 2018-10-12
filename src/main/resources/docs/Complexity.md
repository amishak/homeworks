# Big-O notation is a relative representation of the complexity of an algorithm.

There are some important and deliberately chosen words in that sentence:

> **relative**: you can only compare apples to apples. You can't compare an algorithm to do arithmetic multiplication to an algorithm that sorts a list of integers. But a comparison of two algorithms to do arithmetic operations (one multiplication, one addition) will tell you something meaningful;

> **representation**: Big-O (in its simplest form) reduces the comparison between algorithms to a single variable. That variable is chosen based on observations or assumptions. For example, sorting algorithms are typically compared based on comparison operations (comparing two nodes to determine their relative ordering). This assumes that comparison is expensive. But what if comparison is cheap but swapping is expensive? It changes the comparison; and

> **complexity**: if it takes me one second to sort 10,000 elements how long will it take me to sort one million? Complexity in this instance is a relative measure to something else.

Come back and reread the above when you've read the rest.

The best example of Big-O I can think of is doing arithmetic. Take two numbers (123456 and 789012). The basic arithmetic operations we learnt in school were:
* addition;
* subtraction;
* multiplication; and
* division.

Each of these is an operation or a problem. A method of solving these is called an **algorithm**.

Addition is the simplest. You line the numbers up (to the right) and add the digits in a column writing the last number of that addition in the result. The 'tens' part of that number is carried over to the next column.

Let's assume that the addition of these numbers is the most expensive operation in this algorithm. It stands to reason that to add these two numbers together we have to add together 6 digits (and possibly carry a 7th). If we add two 100 digit numbers together we have to do 100 additions. If we add two 10,000 digit numbers we have to do 10,000 additions.

See the pattern? The **complexity** (being the number of operations) is directly proportional to the number of digits n in the larger number. We call this **O(N)** or **linear complexity**.

Subtraction is similar (except you may need to borrow instead of carry).

Multiplication is different. You line the numbers up, take the first digit in the bottom number and multiply it in turn against each digit in the top number and so on through each digit. So to multiply our two 6 digit numbers we must do 36 multiplications. We may need to do as many as 10 or 11 column adds to get the end result too.

If we have two 100-digit numbers we need to do 10,000 multiplications and 200 adds. For two one million digit numbers we need to do one trillion (1012) multiplications and two million adds.

As the algorithm scales with n-squared, this is **O(N<sup>2</sup>)** or **quadratic complexity**. This is a good time to introduce another important concept:

### We only care about the most significant portion of complexity.

The astute may have realized that we could express the number of operations as: N<sup>2</sup> + 2N. But as you saw from our example with two numbers of a million digits apiece, the second term (2N) becomes insignificant (accounting for 0.0002% of the total operations by that stage).

One can notice that we've assumed the worst case scenario here. While multiplying 6 digit numbers if one of them is 4 digit and the other one is 6 digit, then we only have 24 multiplications. Still we calculate the worst case scenario for that 'n', i.e when both are 6 digit numbers. Hence Big-O notation is about the Worst-case scenario of an algorithm.

### How to find time complexity of an algorithm

You add up how many machine instructions it will execute as a function of the size of its input, and then simplify the expression to the largest (when N is very large) term and can include any simplifying constant factor.

For example, lets see how we simplify 2N + 2 machine instructions to describe this as just O(N).

***Why do we remove the two 2s ?***

We are interested in the performance of the algorithm as N becomes large.

Consider the two terms 2N and 2.

What is the relative influence of these two terms as N becomes large? Suppose N is a million.

Then the first term is 2 million and the second term is only 2.

For this reason, we drop all but the largest terms for large N.

So, now we have gone from 2N + 2 to 2N.

Traditionally, we are only interested in performance up to constant factors.

This means that we don't really care if there is some constant multiple of difference in performance when N is large. The unit of 2N is not well-defined in the first place anyway. So we can multiply or divide by a constant factor to get to the simplest expression.

So 2N becomes just N.

[https://www.quora.com/How-do-we-calculate-space-time-complexity-of-an-algorithm](https://www.quora.com/How-do-we-calculate-space-time-complexity-of-an-algorithm)