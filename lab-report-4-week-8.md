# Markdown Tests

## repo links
[This is the link to markdown-parse repository.](https://github.com/yayajjiang/markdown_inperson)

[This is the link to the one reviewed.](https://github.com/5ean-github/markdown-parse)

The code in the test java file for turning them into a test.
![Tests code](tests_code.png)
## Test1:
Expected result:
![expected result for test1 for my repo](snippet1_result.png)
## Test2:
Expected result:
![expected result for test2 for my repo](snippet2_result.png)
## Test3:
Expected result:
![expected result for test3 for my repo](snippet3_result.png)

For snippet1:
Yes, we can trim all the blank spaces inside the parenthesis, and then we can get the link without blank. It will be easy to implement this function within ten lines of code.
For snippet2:
No, because it contains a nest parenthesis. It will be fairly hard to diagnoise the second () inside a link within ten lines of code.

For snippet3:
Yes, it is easy. Although there are ` inside the brackets. We are only looking at characters inside the parenthesis and turn whatever inside to the links.
