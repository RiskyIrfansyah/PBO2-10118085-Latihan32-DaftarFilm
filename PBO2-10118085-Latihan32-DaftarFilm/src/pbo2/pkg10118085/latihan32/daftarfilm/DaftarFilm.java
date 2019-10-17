/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan32.daftarfilm;

/**
 *
 * @author Risky
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
* Deskripsi Tugas : Daftar Film
 */
public class DaftarFilm {
    
    public static void main(String[] args) {
    
    System.out.println("=== Daftar Film Yang Sedang Tayang ===\n");
        
    Film film = new Film();
    
    film.filmName = "Venom";
    film.filmGenre = "Action, Horror, Scifi";
    film.filmRating = 8.5;
    film.filmDuration = 120;
    film.nowPlaying();
    film.filmName = "Small Foot";
    film.filmGenre = "Animation";
    film.filmRating = 9.0;
    film.filmDuration = 96;
    film.nowPlaying();
    film.filmName = "Crazy Rich Asian";
    film.filmGenre = "Comedy";
    film.filmRating = 7.8;
    film.filmDuration = 119;
    film.nowPlaying();
    film.filmName = "Asih";
    film.filmGenre = "Horror";
    film.filmRating = 6.0;
    film.filmDuration = 100;
    film.nowPlaying();
    }        
}
