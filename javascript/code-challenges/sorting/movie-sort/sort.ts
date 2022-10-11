import { filterArray } from "cheerio/lib/api/traversing";
import { Movie } from "./movies";

export function sortYear(movies: Movie[]): Movie[] {
  //TODO
  return movies.sort((prev, curr) => prev.year > curr.year ? 1: curr.year > prev.year ? -1 : 0);

}

export function sortTitle(movies: Movie[]): Movie[] {
  let regex: RegExp = /^The\s+/;
  movies.map((e) => [e.title.replace(regex, ''), e]).sort((a, b) => a.title.localeCompare(b.title)).map(([, element]) => element);
  return result;
  };
// }

export function inGenre(movies: Movie[], genre: string): Movie[] {
  //TODO
}
