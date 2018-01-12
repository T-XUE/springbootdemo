<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js"> <!--<![endif]-->
    #parse("/layout/header.vm")
<body>
<div id="fh5co-wrapper">
    <div id="fh5co-page">

        #parse("/layout/guide.vm")

        <!-- end:header-top -->

        <div class="fh5co-hero">
            <div class="fh5co-overlay"></div>
            <div class="fh5co-cover" data-stellar-background-ratio="0.5"
                 style="background-image: url(images/cover_bg_5.jpg);">
                <div class="desc">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-5 col-md-5">
                                <!-- <a href="index.html" id="main-logo">Travel</a> -->
                                <div class="tabulation animate-box">

                                    <!-- Nav tabs -->
                                    <ul class="nav nav-tabs" role="tablist">
                                        <li role="presentation">
                                            <a href="#flights" aria-controls="flights" role="tab" data-toggle="tab">Flights</a>
                                        </li>
                                        <li role="presentation" class="active">
                                            <a href="#hotels" aria-controls="hotels" role="tab"
                                               data-toggle="tab">Hotels</a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#packages" aria-controls="packages" role="tab" data-toggle="tab">Packages</a>
                                        </li>
                                    </ul>

                                    <!-- Tab panes -->
                                    <div class="tab-content">
                                        <div role="tabpanel" class="tab-pane" id="flights">
                                            <div class="row">
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <div class="input-field">
                                                        <label for="from">From:</label>
                                                        <input type="text" class="form-control" id="from-place"
                                                               placeholder="Los Angeles, USA"/>
                                                    </div>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <div class="input-field">
                                                        <label for="from">To:</label>
                                                        <input type="text" class="form-control" id="to-place"
                                                               placeholder="Tokyo, Japan"/>
                                                    </div>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt alternate">
                                                    <div class="input-field">
                                                        <label for="date-start">Check In:</label>
                                                        <input type="text" class="form-control" id="date-start"
                                                               placeholder="mm/dd/yyyy"/>
                                                    </div>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt alternate">
                                                    <div class="input-field">
                                                        <label for="date-end">Check Out:</label>
                                                        <input type="text" class="form-control" id="date-end"
                                                               placeholder="mm/dd/yyyy"/>
                                                    </div>
                                                </div>
                                                <div class="col-sm-12 mt">
                                                    <section>
                                                        <label for="class">Class:</label>
                                                        <select class="cs-select cs-skin-border">
                                                            <option value="" disabled selected>Economy</option>
                                                            <option value="economy">Economy</option>
                                                            <option value="first">First</option>
                                                            <option value="business">Business</option>
                                                        </select>
                                                    </section>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <section>
                                                        <label for="class">Adult:</label>
                                                        <select class="cs-select cs-skin-border">
                                                            <option value="" disabled selected>1</option>
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                        </select>
                                                    </section>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <section>
                                                        <label for="class">Children:</label>
                                                        <select class="cs-select cs-skin-border">
                                                            <option value="" disabled selected>1</option>
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                        </select>
                                                    </section>
                                                </div>
                                                <div class="col-xs-12">
                                                    <input type="submit" class="btn btn-primary btn-block"
                                                           value="Search Flight">
                                                </div>
                                            </div>
                                        </div>

                                        <div role="tabpanel" class="tab-pane active" id="hotels">
                                            <div class="row">
                                                <div class="col-xxs-12 col-xs-12 mt">
                                                    <div class="input-field">
                                                        <label for="from">City:</label>
                                                        <input type="text" class="form-control" id="from-place"
                                                               placeholder="Los Angeles, USA"/>
                                                    </div>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt alternate">
                                                    <div class="input-field">
                                                        <label for="date-start">Return:</label>
                                                        <input type="text" class="form-control" id="date-start"
                                                               placeholder="mm/dd/yyyy"/>
                                                    </div>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt alternate">
                                                    <div class="input-field">
                                                        <label for="date-end">Check Out:</label>
                                                        <input type="text" class="form-control" id="date-end"
                                                               placeholder="mm/dd/yyyy"/>
                                                    </div>
                                                </div>
                                                <div class="col-sm-12 mt">
                                                    <section>
                                                        <label for="class">Rooms:</label>
                                                        <select class="cs-select cs-skin-border">
                                                            <option value="" disabled selected>1</option>
                                                            <option value="economy">1</option>
                                                            <option value="first">2</option>
                                                            <option value="business">3</option>
                                                        </select>
                                                    </section>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <section>
                                                        <label for="class">Adult:</label>
                                                        <select class="cs-select cs-skin-border">
                                                            <option value="" disabled selected>1</option>
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                        </select>
                                                    </section>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <section>
                                                        <label for="class">Children:</label>
                                                        <select class="cs-select cs-skin-border">
                                                            <option value="" disabled selected>1</option>
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                        </select>
                                                    </section>
                                                </div>
                                                <div class="col-xs-12">
                                                    <input type="submit" class="btn btn-primary btn-block"
                                                           value="Search Hotel">
                                                </div>
                                            </div>
                                        </div>

                                        <div role="tabpanel" class="tab-pane" id="packages">
                                            <div class="row">
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <div class="input-field">
                                                        <label for="from">City:</label>
                                                        <input type="text" class="form-control" id="from-place"
                                                               placeholder="Los Angeles, USA"/>
                                                    </div>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <div class="input-field">
                                                        <label for="from">Destination:</label>
                                                        <input type="text" class="form-control" id="to-place"
                                                               placeholder="Tokyo, Japan"/>
                                                    </div>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt alternate">
                                                    <div class="input-field">
                                                        <label for="date-start">Departs:</label>
                                                        <input type="text" class="form-control" id="date-start"
                                                               placeholder="mm/dd/yyyy"/>
                                                    </div>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt alternate">
                                                    <div class="input-field">
                                                        <label for="date-end">Return:</label>
                                                        <input type="text" class="form-control" id="date-end"
                                                               placeholder="mm/dd/yyyy"/>
                                                    </div>
                                                </div>
                                                <div class="col-sm-12 mt">
                                                    <section>
                                                        <label for="class">Rooms:</label>
                                                        <select class="cs-select cs-skin-border">
                                                            <option value="" disabled selected>1</option>
                                                            <option value="economy">1</option>
                                                            <option value="first">2</option>
                                                            <option value="business">3</option>
                                                        </select>
                                                    </section>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <section>
                                                        <label for="class">Adult:</label>
                                                        <select class="cs-select cs-skin-border">
                                                            <option value="" disabled selected>1</option>
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                        </select>
                                                    </section>
                                                </div>
                                                <div class="col-xxs-12 col-xs-6 mt">
                                                    <section>
                                                        <label for="class">Children:</label>
                                                        <select class="cs-select cs-skin-border">
                                                            <option value="" disabled selected>1</option>
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                        </select>
                                                    </section>
                                                </div>
                                                <div class="col-xs-12">
                                                    <input type="submit" class="btn btn-primary btn-block"
                                                           value="Search Packages">
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            <div class="desc2 animate-box">
                                <div class="col-sm-7 col-sm-push-1 col-md-7 col-md-push-1">
                                    <p>HandCrafted by <a href="http://frehtml5.co/" target="_blank"
                                                         class="fh5co-site-name">FreeHTML5.co</a></p>
                                    <h2>Exclusive Limited Time Offer</h2>
                                    <h3>Fly to Hong Kong via Los Angeles, USA</h3>
                                    <span class="price">$599</span>
                                    <!-- <p><a class="btn btn-primary btn-lg" href="#">Get Started</a></p> -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>


        <div id="fh5co-tours" class="fh5co-section-gray">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2 text-center heading-section animate-box">
                        <h3>Popular hotel &amp; hostel destinations</h3>
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,
                            there live the blind texts.</p>
                    </div>
                </div>
                <div class="row row-bottom-padded-md">
                    <div class="col-md-4 col-sm-6 fh5co-tours animate-box" data-animate-effect="fadeIn">
                        <div href="#"><img src="images/place-1.jpg" alt="Free HTML5 Website Template by FreeHTML5.co"
                                           class="img-responsive">
                            <div class="desc">
                                <span></span>
                                <h3>New York</h3>
                                <span>3 nights</span>
                                <span class="price">$1,000</span>
                                <a class="btn btn-primary btn-outline" href="#">Book Now <i
                                        class="icon-arrow-right22"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6 fh5co-tours animate-box" data-animate-effect="fadeIn">
                        <div href="#"><img src="images/place-2.jpg" alt="Free HTML5 Website Template by FreeHTML5.co"
                                           class="img-responsive">
                            <div class="desc">
                                <span></span>
                                <h3>Philippines</h3>
                                <span>4 nights</span>
                                <span class="price">$1,000</span>
                                <a class="btn btn-primary btn-outline" href="#">Book Now <i
                                        class="icon-arrow-right22"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6 fh5co-tours animate-box" data-animate-effect="fadeIn">
                        <div href="#"><img src="images/place-3.jpg" alt="Free HTML5 Website Template by FreeHTML5.co"
                                           class="img-responsive">
                            <div class="desc">
                                <span></span>
                                <h3>Hongkong</h3>
                                <span>2 nights</span>
                                <span class="price">$1,000</span>
                                <a class="btn btn-primary btn-outline" href="#">Book Now <i
                                        class="icon-arrow-right22"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6 fh5co-tours animate-box" data-animate-effect="fadeIn">
                        <div href="#"><img src="images/place-1.jpg" alt="Free HTML5 Website Template by FreeHTML5.co"
                                           class="img-responsive">
                            <div class="desc">
                                <span></span>
                                <h3>New York</h3>
                                <span>3 nights</span>
                                <span class="price">$1,000</span>
                                <a class="btn btn-primary btn-outline" href="#">Book Now <i
                                        class="icon-arrow-right22"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6 fh5co-tours animate-box" data-animate-effect="fadeIn">
                        <div href="#"><img src="images/place-2.jpg" alt="Free HTML5 Website Template by FreeHTML5.co"
                                           class="img-responsive">
                            <div class="desc">
                                <span></span>
                                <h3>Philippines</h3>
                                <span>4 nights</span>
                                <span class="price">$1,000</span>
                                <a class="btn btn-primary btn-outline" href="#">Book Now <i
                                        class="icon-arrow-right22"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6 fh5co-tours animate-box" data-animate-effect="fadeIn">
                        <div href="#"><img src="images/place-3.jpg" alt="Free HTML5 Website Template by FreeHTML5.co"
                                           class="img-responsive">
                            <div class="desc">
                                <span></span>
                                <h3>Hongkong</h3>
                                <span>2 nights</span>
                                <span class="price">$1,000</span>
                                <a class="btn btn-primary btn-outline" href="#">Book Now <i
                                        class="icon-arrow-right22"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 animate-box">
                        <h2 class="heading-title">Travel Booking guide to book a perfect hotel</h2>
                    </div>
                    <div class="col-md-6 animate-box">
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,
                            there live the blind texts. Pellentesque habitant morbi tristique senectus et netus ett
                            mauada fames ac turpis egestas. Etiam euismod tempor leo, in suscipit urna condimentum sed.
                            Vivamus augue enim, consectetur ac interdum a, pulvinar ac massa. Nullam malesuada
                            congue </p>
                        <p>Pellentesque habitant morbi tristique senectus et netus ett mauada fames ac turpis egestas.
                            Etiam euismod tempor leo, in suscipit urna condimentum sed. Vivamus augue enim, consectetur
                            ac interdum a, pulvinar ac massa. Nullam malesuada congue </p>
                        <a href="#">Read More <i class="icon-arrow-right22"></i></a>
                    </div>
                    <div class="col-md-6 animate-box">
                        <img class="img-responsive" src="images/cover_bg_2.jpg" alt="travel">
                    </div>
                </div>
            </div>
        </div>
        <div id="fh5co-testimonial" style="background-image:url(images/img_bg_1.jpg);">
            <div class="container">
                <div class="row animate-box">
                    <div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
                        <h2>Happy Clients</h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <div class="box-testimony animate-box">
                            <blockquote>
                                <span class="quote"><span><i class="icon-quotes-right"></i></span></span>
                                <p>&ldquo;Far far away, behind the word mountains, far from the countries Vokalia and
                                    Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right
                                    at the coast of the Semantics, a large language ocean.&rdquo;</p>
                            </blockquote>
                            <p class="author">John Doe, CEO <a href="#" target="_blank">FREEHTML5.co</a> <span
                                    class="subtext">Creative Director</span></p>
                        </div>

                    </div>
                    <div class="col-md-4">
                        <div class="box-testimony animate-box">
                            <blockquote>
                                <span class="quote"><span><i class="icon-quotes-right"></i></span></span>
                                <p>&ldquo;Far far away, behind the word mountains, far from the countries Vokalia and
                                    Consonantia, there live the blind texts.&rdquo;</p>
                            </blockquote>
                            <p class="author">John Doe, CEO <a href="#" target="_blank">FREEHTML5.co</a> <span
                                    class="subtext">Creative Director</span></p>
                        </div>


                    </div>
                    <div class="col-md-4">
                        <div class="box-testimony animate-box">
                            <blockquote>
                                <span class="quote"><span><i class="icon-quotes-right"></i></span></span>
                                <p>&ldquo;Far far away, behind the word mountains, far from the countries Vokalia and
                                    Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right
                                    at the coast of the Semantics, a large language ocean.&rdquo;</p>
                            </blockquote>
                            <p class="author">John Doe, Founder <a href="#">FREEHTML5.co</a> <span class="subtext">Creative Director</span>
                            </p>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        #parse("/layout/footer.vm")


    </div>
    <!-- END fh5co-page -->

</div>
<!-- END fh5co-wrapper -->

<!-- jQuery -->


<script src="js/jquery.min.js"></script>
<!-- jQuery Easing -->
<script src="js/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script src="js/bootstrap.min.js"></script>
<!-- Waypoints -->
<script src="js/jquery.waypoints.min.js"></script>
<script src="js/sticky.js"></script>

<!-- Stellar -->
<script src="js/jquery.stellar.min.js"></script>
<!-- Superfish -->
<script src="js/hoverIntent.js"></script>
<script src="js/superfish.js"></script>
<!-- Magnific Popup -->
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/magnific-popup-options.js"></script>
<!-- Date Picker -->
<script src="js/bootstrap-datepicker.min.js"></script>
<!-- CS Select -->
<script src="js/classie.js"></script>
<script src="js/selectFx.js"></script>

<!-- Main JS -->
<script src="js/main.js"></script>

</body>
</html>

