package com.program.training.systemdesign.businesssystemsimulation;


import java.util.*;
import java.util.stream.Stream;

/**
 * Design a simplified version of Twitter where users can post tweets,
 * follow/unfollow another user, and is able to see the 10 most recent tweets in the user's news feed.
 *
 * @author naletov
 */
public class Twitter
{
    private final Map<Integer, Map<Integer, Long>> users;
    private final Map<Integer, Set<Integer>> followers;
    private long timestamp;

    /**
     * Initializes your twitter object.
     */
    public Twitter() {
        users = new HashMap<>();
        followers = new HashMap<>();
    }

    /**
     *  Composes a new tweet with ID tweetId by the user userId.
     *  Each call to this function will be made with a unique tweetId.
     *
     * @param userId user ID
     * @param tweetId tweet ID
     */
    public void postTweet(int userId, int tweetId) {

        users.computeIfAbsent(userId, k -> new LinkedHashMap<>(10, 0.75f, true)
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest)
            {
                return size() > 10;
            }
        });
        users.get(userId).put(tweetId, ++timestamp);
    }

    /**
     * Retrieves the 10 most recent tweet IDs in the user's news feed.
     * Each item in the news feed must be posted by users who the user followed or by the user themself.
     * Tweets must be ordered from most recent to least recent.
     *
     * @param userId user ID
     * @return the 10 most recent tweet IDs in the user's news feed
     */
    public List<Integer> getNewsFeed(int userId) {
        Set<Integer> followee = followers.computeIfAbsent(userId, _ -> new HashSet<>());

        return Stream.concat(Stream.of(userId), followee.stream())
                .filter(users::containsKey)
                .flatMap(id -> users.get(id).entrySet().stream())
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(10)
                .map(Map.Entry::getKey)
                .toList();
    }

    /**
     * The user with ID followerId started following the user with ID followeeId.
     *
     * @param followerId follower user ID
     * @param followeeId followee user ID
     */
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return; // exception in real world
        }
        followers.computeIfAbsent(followerId, _ -> new HashSet<>()).add(followeeId);
    }

    /**
     * The user with ID followerId started unfollowing the user with ID followeeId.
     *
     * @param followerId follower user ID
     * @param followeeId followee user ID
     */
    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return; // exception in real world
        }
        followers.getOrDefault(followerId, Collections.emptySet()).remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */