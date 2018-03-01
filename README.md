# Histogram

Submit a report with your code, a description of your data
source, your output (label the histogram - by hand if you
like). Discuss your results.

## Description of Data Source:
We decided to use MLB salaries because it was more fun than some other data sources we found online. Not only that, but we also found that the dataset was extensive -- close to 20,000 entries. Although these were fun numbers, we realized that only the first digit was going to be used, nevertheless, we decided to stick with it.

## Output:

* = approximately 181 occurrences

   1: ******************************
   2: ********************
   3: *******************
   4: **************
   5: *******
   6: *******
   7: ******
   8: *****
   9: ****
  10: 

## Discuss Results
### Issues we ran into:
We had to take the time to understand the Histogram.java file. For example, the max parameter in the Histogram method:
Code block is excerpt from the Histogram.java class provided to us:

public Histogram(int max) { this.min = 1; this.max = max; counts = new int[max - min + 1]; }

We believed at first it was the axis that goes from 1-9 because the other axis is counting the number of occurrences. We tested it and our assumptions were accurate.
