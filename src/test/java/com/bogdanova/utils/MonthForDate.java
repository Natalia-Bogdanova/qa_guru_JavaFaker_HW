package com.bogdanova.utils;

    import java.time.Month;
    import java.util.Random;

    public enum MonthForDate {
        January, February, March, April,
        May, June, July, August,
        September, October, November, December;

        public static Month getRandomMonth() {
            int pick = new Random().nextInt(Month.values().length);
            return Month.values()[pick];
        }
    }
