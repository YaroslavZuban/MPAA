#pragma once
#include <vector>
#include <map>
#include <iostream>
#include <algorithm>  
#include <initializer_list> 
using namespace std;

class sortArray {
    public:
        static vector<int> count_sort(vector<int> array, int min, int max) {
            vector<int> count(max-min+1);
            int countNumber=0;

            for (int i = min; i < max; i++) {
                countNumber = 0;

                for (const auto& t : array) {
                    if (array[i]>t) {
                        countNumber++;
                    }
                }

                count[countNumber]= array[i];
            }

            return count;
        }

        static map<int, int> count_sort_map(vector<int> array, int min, int max) {
            map<int, int> count;
          
            int countNumber=0;

            for (int i = min; i < max; i++) {
                countNumber = 0;

                for (const auto& t : array) {
                    if (array[i]>t) {
                        countNumber++;
                    }
                }

                count.emplace(countNumber, array[i]);
            }

            return count;
        }
};