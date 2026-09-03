#include <bits/stdc++.h>
using namespace std;

class AreaCalculator {
public:
    static int calculateArea(int length, int width) {
        return length * width;
    }
};

int main() {
    int area1 = AreaCalculator::calculateArea(10, 5);
    int area2 = AreaCalculator::calculateArea(8, 4);

    cout << "Area1: " << area1 << endl;
    cout << "Area2: " << area2 << endl;

    return 0;
}
