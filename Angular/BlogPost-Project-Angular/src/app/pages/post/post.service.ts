import { Injectable } from '@angular/core';
import { Post } from './post';
import { dataPosts } from '../../../assets/data/dataPosts'; //data

@Injectable({
    providedIn: 'root'
})
export class PostService {
    private posts: Post[] = [];
    constructor() { }
    getPosts(): Post[] {
        return this.posts;
    }
    setPosts(): void {
        this.posts = dataPosts;
    }
    deletePost(id: number): void {
        this.posts = this.posts.filter((post) => post.postId !== id);
    }

    findPostById(id: number): Post | undefined {
        return this.posts.find((post) => Number(post.postId) === Number(id))
    }

    addPost(post: Post) {
        this.posts.push(post);
    }

    updatePost(updatedPost: Post) {
        this.posts = this.posts.map(post => {
            if (post.postId === updatedPost.postId)
                post = updatedPost;
            return post;
        });
    }
}