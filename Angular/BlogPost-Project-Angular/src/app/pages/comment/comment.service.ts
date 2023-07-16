import { Injectable } from '@angular/core';
import { Comment } from './comment';
import { dataComments } from 'src/assets/data/dataComments';

@Injectable({
    providedIn: 'root'
})
export class CommentService {
    private comments: Comment[] = [];
    constructor() { }

    getComments(): Comment[] {
        return this.comments;
    }

    setComments(): void {
        this.comments = dataComments;
    }

    deleteComment($event: number) {
        this.comments = this.comments.filter((comment) => comment.commentId !== $event);
    }

    addComment(comment: Comment) {
        this.comments.push(comment);
    }
}