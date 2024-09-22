package com.JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class FavoriteMoviesTracker  {
    public static ArrayList<String> favoriteMovies = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nFavorite Movies Tracker");
            System.out.println("1. Add Movie");
            System.out.println("2. Remove Movie");
            System.out.println("3. Display Movies");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    removeMovie();
                    break;
                case 3:
                    displayMovies();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void addMovie() {
        System.out.print("Enter movie title: ");
        String movieTitle = scanner.nextLine();
        favoriteMovies.add(movieTitle);
        System.out.println("Movie added successfully!");
    }

    private static void removeMovie() {
        if (favoriteMovies.isEmpty()) {
            System.out.println("No movies to remove.");
            return;
        }

        System.out.println("Choose a movie to remove:");
        for (int i = 0; i < favoriteMovies.size(); i++) {
            System.out.println((i + 1) + ". " + favoriteMovies.get(i));
        }
        System.out.print("Enter movie number: ");
        int movieNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        if (0 < movieNumber && movieNumber <= favoriteMovies.size()) {
            favoriteMovies.remove(movieNumber - 1);
            System.out.println("Movie removed successfully!");
        } else {
            System.out.println("Invalid movie number.");
        }
    }

    private static void displayMovies() {
        if (favoriteMovies.isEmpty()) {
            System.out.println("No favorite movies.");
            return;
        }

        System.out.println("Favorite Movies:");
        for (int i = 0; i < favoriteMovies.size(); i++) {
            System.out.println((i + 1) + ". " + favoriteMovies.get(i));
        }
    }
}