package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        int result = 0;
        if (boundary - amount % boundary == 1000) {
            return 0;
        }
        return boundary - amount % boundary;
    }
}
