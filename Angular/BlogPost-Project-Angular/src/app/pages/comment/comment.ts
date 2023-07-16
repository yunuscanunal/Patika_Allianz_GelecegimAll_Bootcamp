export interface Comment {
    commentId: number,
    postId: number,
    userId: number,
    comment: string,
    creationDate: string,
    isConfirmed: boolean
};