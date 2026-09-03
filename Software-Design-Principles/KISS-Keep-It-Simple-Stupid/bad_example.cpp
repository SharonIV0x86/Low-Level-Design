#include <bits/stdc++.h>
using namespace std;

class NumberUtils {
public:
    static bool isEven(int number) {
        // Using unnecessary logic to determine evenness
        bool isEven = false;

        if (number % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }

        return isEven;
    }
};
