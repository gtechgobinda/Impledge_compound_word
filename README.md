# Longest Compounded Word
### Problem Statement

Write a program that:
1. Reads provided files (Input_01.txt and Input_02.txt) containing alphabetically sorted words list (one word per line, no spaces, all lower case)

2. Identifies & display below given data in logs/console/output file

(i)longest compounded word

(ii) second longest compounded word

(iii)time taken to process the input file

Note: A compounded word is one that can be constructed by combining (concatenating) shorter words
also found in the same file

### Approach

Here used File Handling, ArrayList, Arrays, Comparator, Hashset . Also used Recursive method and Dynamic Programming.

### Running the code
**Input 01**

For example, if the input file is:
```
cat
cats
catsdogcats
catxdogcatsrat
dog
dogcatsdog
hippopotamuses
rat
ratcat
ratcatdog
ratcatdogcat
```
We get as a ouput :
```
Longest Compound Word: ratcatdogcat
Second Longest Compound Word: catsdogcats
Time Taken : 8ms
```
**Input 02**

Input_02.txt is a long word list, consisting 100,000+ items
We get as a ouput :

```
Longest Compound Word: ethylenediaminetetraacetates
Second Longest Compound Word: electroencephalographically
Time Taken : 12ms

```
