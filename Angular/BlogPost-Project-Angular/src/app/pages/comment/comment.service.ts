import { Injectable } from '@angular/core';
import { Comment } from './comment';
import { dataComments } from '../../../assets/data/dataComments';


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

    deleteComment(id: number) {
        this.comments = this.comments.filter((comment) => comment.commentId !== id);
    }

    findCommentById(id: Number): Comment | undefined {
        return this.comments.find((comment) => comment.commentId === Number(id));
    }

    addComment(comment: Comment) {
        this.comments.push(comment);
    }
}