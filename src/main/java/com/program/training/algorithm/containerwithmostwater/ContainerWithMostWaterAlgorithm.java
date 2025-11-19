package com.program.training.algorithm.containerwithmostwater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * <a href="https://leetcode.com/problems/container-with-most-water/description/">...</a>
 *
 * @author naletov
 */
public class ContainerWithMostWaterAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ContainerWithMostWaterAlgorithm.class);


    /**
     * Returns the maximum amount of water a container can store (Good and correct)
     * @param height pillar's height
     * @return mas area
     */
    public int maxArea(int[] height)
    {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right)
        {
            if(height[left] < height[right])
            {
                maxArea = Math.max(maxArea, height[left] * (right - left));
                LOGGER.info("left {} ({}), right {} ({}) and area: {}", left, height[left], right, height[right], maxArea);
                left++;
            }
            else
            {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                LOGGER.info("left {} ({}), right {} ({}) and area: {}", left, height[left], right, height[right], maxArea);
                right--;
            }
        }
        return maxArea;
    }

    /**
     * Returns the maximum amount of water a container can store (more readable)
     * @param height pillar's height
     * @return mas area
     */
    public int maxAreaSimplified(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right)
        {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            LOGGER.info("left {} ({}), right {} ({}) and area: {}", left, height[left], right, height[right], maxArea);

            if (height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;
    }
}
