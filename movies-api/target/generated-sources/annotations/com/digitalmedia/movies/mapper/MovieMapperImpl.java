package com.digitalmedia.movies.mapper;

import com.digitalmedia.movies.model.Movie;
import com.digitalmedia.movies.model.Movie.Comment;
import com.digitalmedia.movies.model.dto.CreateMovieRequest;
import com.digitalmedia.movies.model.dto.MovieDto;
import com.digitalmedia.movies.model.dto.MovieDto.CommentDto;
import com.digitalmedia.movies.model.dto.UpdateMovieRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-18T15:14:38-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class MovieMapperImpl extends MovieMapper {

    @Override
    public Movie toMovie(CreateMovieRequest createMovieRequest) {
        if ( createMovieRequest == null ) {
            return null;
        }

        Movie movie = new Movie();

        movie.setDirector( createMovieRequest.getDirector() );
        movie.setImdbId( createMovieRequest.getImdbId() );
        movie.setPoster( createMovieRequest.getPoster() );
        movie.setTitle( createMovieRequest.getTitle() );
        movie.setYear( createMovieRequest.getYear() );

        return movie;
    }

    @Override
    public void updateMovieFromDto(UpdateMovieRequest updateMovieRequest, Movie movie) {
        if ( updateMovieRequest == null ) {
            return;
        }

        if ( updateMovieRequest.getDirector() != null ) {
            movie.setDirector( updateMovieRequest.getDirector() );
        }
        if ( updateMovieRequest.getPoster() != null ) {
            movie.setPoster( updateMovieRequest.getPoster() );
        }
        if ( updateMovieRequest.getTitle() != null ) {
            movie.setTitle( updateMovieRequest.getTitle() );
        }
        if ( updateMovieRequest.getYear() != null ) {
            movie.setYear( updateMovieRequest.getYear() );
        }
    }

    @Override
    public MovieDto toMovieDto(Movie movie) {
        if ( movie == null ) {
            return null;
        }

        MovieDto movieDto = new MovieDto();

        movieDto.setComments( commentListToCommentDtoList( movie.getComments() ) );
        movieDto.setDirector( movie.getDirector() );
        movieDto.setImdbId( movie.getImdbId() );
        movieDto.setPoster( movie.getPoster() );
        movieDto.setTitle( movie.getTitle() );
        movieDto.setYear( movie.getYear() );

        return movieDto;
    }

    @Override
    public CommentDto toMovieDtoCommentDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDto commentDto = new CommentDto();

        commentDto.setText( comment.getText() );
        commentDto.setTimestamp( comment.getTimestamp() );
        commentDto.setUsername( comment.getUsername() );

        return commentDto;
    }

    protected List<CommentDto> commentListToCommentDtoList(List<Comment> list) {
        if ( list == null ) {
            return null;
        }

        List<CommentDto> list1 = new ArrayList<CommentDto>( list.size() );
        for ( Comment comment : list ) {
            list1.add( toMovieDtoCommentDto( comment ) );
        }

        return list1;
    }
}
