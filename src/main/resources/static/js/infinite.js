(function ($) {
    var isLastPage = false;
    var currentPage = 1;
    var fetching = false;

    $(window).scroll(function () {

        if ($(window).scrollTop() >= $(document).height() - $(window).height() - 30) {

            if (isLastPage || fetching) {
                return; // either there are no more pages, or we're already fetching the next page
            }

            fetching = true;

            var request = $.ajax({
                url: "/posts.json",
                data: {page: currentPage}
            });

            request.done(function (page) {
                var html = "", i;
                var posts = page.content;
                var $posts = $("[data-posts]");
                isLastPage = page.last;

                for (i = 0; i < posts.length; i++) {
                    html += "<div><h1>" + posts[i].title + "</h1><p>" + posts[i].body + "</p></div>";
                }

                $posts.reverse(); // look into reversing the order of the blog posts
                $posts.append(html);



                currentPage++;
                fetching = false;
            });
        }
    });
})(jQuery);